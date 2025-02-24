def call( Map PipelineParams = [:]) {
  sh "echo hello ${PipelineParams.name}. Today is ${PipelineParams.dayofWeek}."
}
