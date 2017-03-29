package myapp

class BootStrap {

    BootStrapService bootStrapService

    def init = { servletContext ->
        bootStrapService.init()
    }
    def destroy = {
    }
}
