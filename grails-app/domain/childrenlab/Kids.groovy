package childrenlab

public enum KidsStatus {
    PRIVATE, PUBLIC, REMOVED
}

class Kids {

    String firstName
    String lastName
    String nickName
    Date birthday
    String note
    KidsStatus status = KidsStatus.PUBLIC

    Date dateCreated
    Date lastUpdated

    static belongsTo = [parent: User]

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        nickName nullable: true
        birthday nullable: true
        note nullable: true

        dateCreated nullable: true
        lastUpdated nullable: true
    }
}
