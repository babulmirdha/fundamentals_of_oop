class Rectangle:
    def __init__(self, width, height):
        self.__width = width  # Private attributes
        self.__height = height

    def set_width(self, width):
        if width > 0:
            self.__width = width
        else:
            print("Width must be positive.")

    def set_height(self, height):
        if height > 0:
            self.__height = height
        else:
            print("Height must be positive.")

    def area(self):
        return self.__width * self.__height

    def perimeter(self):
        return 2 * (self.__width + self.__height)
