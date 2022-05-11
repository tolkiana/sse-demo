rootProject.name = "sse-demo"


include("serviceA")
include("serviceB")

include(":library")
project(":library").projectDir = file("library")