setwd("/Users/robertarnold/Projects/java-realtime-model/src/main/r/simple-lm-model")
load("model.rda")

evaluate <- function(newY) {
  predict.lm(model_fit, newdata=data.frame(y=newY))
}
