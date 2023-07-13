#!/usr/bin/env Rscript
library(dplyr)
library(ggplot2)

inputPath <- '../../../../../output/output.csv'
basedir <- '../../../target/figures'
if (!file.exists(basedir)) {
  dir.create(basedir)
}

getModelSize <- function(source) {
  # Extract the number at the start of the string using the `gsub` function.
  number <- gsub("^[^0-9]*([0-9]+).*", "\\1", source)
  number[number == source] <- '1'
  as.numeric(number)
}

data <- read.csv(inputPath, sep=';') %>% mutate(ModelSize = getModelSize(Source))
phases <- unique(data$PhaseName)

execution_times <- (
  data %>% filter(MetricName=='Runtime (ns)')
       %>% group_by(PhaseName, Tool, ModelSize)
       %>% summarise(average_seconds=mean(MetricValue)/1e9)
)

memory_usages <- (
  data %>% filter(MetricName=='Memory used (b)')
  %>% group_by(PhaseName, Tool, ModelSize)
  %>% summarise(average_mbs=mean(MetricValue)/2**20)
)

firstPhase <- TRUE
for (phase in phases) {
  run_times <- execution_times %>% filter(PhaseName==phase)
  mem_usage <- memory_usages %>% filter(PhaseName==phase)

  (ggplot(data=run_times, aes(x=ModelSize, y=average_seconds, color=Tool, linetype=Tool))
    + geom_line() + geom_label(aes(label=format(average_seconds, digits=2)), fill='white', key_glyph='path')
    + labs(x="Model size", y='Time (s)')
    + scale_x_log10(expand=c(0.1, 0.1))
    + scale_y_log10()
    + theme(legend.position=ifelse(firstPhase, 'top', 'none'))
  )
  ggsave(paste0(basedir, '/runtime-', phase, '.pdf'), width=4, height=4)
  
  (ggplot(data=mem_usage, aes(x=ModelSize, y=average_mbs, color=Tool, linetype=Tool))
    + geom_line() + geom_label(aes(label=format(average_mbs, digits=4)), fill='white', key_glyph='path')
    + labs(x="Model size", y='Memory usage (MiB)')
    + scale_x_log10(expand=c(0.1, 0.1))
    + scale_y_log10()
    + theme(legend.position=ifelse(firstPhase, 'top', 'none'))
  )
  ggsave(paste0(basedir, '/memory-', phase, '.pdf'), width=4, height=4)

  firstPhase <- FALSE
}
