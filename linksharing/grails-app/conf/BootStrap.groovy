import com.grailsinaction.*
class BootStrap {
    def bootstrapService

    def init = { servletContext ->
         bootstrapService.bootstrap();
    }
    def destroy = {
    }
}
