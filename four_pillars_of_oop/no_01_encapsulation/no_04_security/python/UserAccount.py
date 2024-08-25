class UserAccount:
    def __init__(self, username, password):
        self.__username = username
        self.__password = self.__encrypt_password(password)  # Private attribute

    def __encrypt_password(self, password):
        # Simplified encryption (not for real use)
        return password[::-1]

    def check_password(self, password):
        return self.__password == self.__encrypt_password(password)
