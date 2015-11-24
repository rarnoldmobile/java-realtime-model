## BLAH BLAH BLAH, I DO A BUNCH OF ANALYSIS
setwd("/Users/robertarnold/Projects/java-realtime-model/src/main/r/simple-lm-model")

df <- data.frame(x=1:10, y=(1:10)+rnorm(n=10))
model_fit <- lm(x ~ y)
summary(model_fit)
str(model_fit)

model_fit
predict.lm(model_fit, newdata=data.frame(y=2))

# I have my final model - and showed  a sample prediction, save this into the file system
save(model_fit, file = "model.rda")
