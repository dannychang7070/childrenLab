package childrenlab

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class UserController {

    def userService

    def register(String email, String password, String phoneNumber, String firstName, String lastName, String birthday, String nickName, String sex, String address, String city, int zipCode, String role){

        def result = userService.register(email, password, phoneNumber, firstName, lastName, birthday, nickName, sex, address, city, zipCode, role)

        render result as JSON
    }

    @Secured(['ROLE_USER'])
    def addKid(String firstName, String lastName, String nickName, String birthday, String note){

        def result = userService.addKid(firstName, lastName,nickName, birthday, note)

        render result as JSON

    }

}
