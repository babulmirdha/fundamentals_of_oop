class Temperature:
    def __init__(self, celsius):
        self.__celsius = celsius  # Private attribute

    def to_fahrenheit(self):
        return (self.__celsius * 9/5) + 32

    def set_celsius(self, celsius):
        self.__celsius = celsius

    def get_celsius(self):
        return self.__celsius
