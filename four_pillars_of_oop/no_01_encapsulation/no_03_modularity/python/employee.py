class Employee:
    def __init__(self, name, salary):
        self.__name = name
        self.__salary = salary

    def set_salary(self, salary):
        if salary > 0:
            self.__salary = salary
        else:
            print("Salary must be positive.")

    def get_salary(self):
        return self.__salary

    def get_details(self):
        return f"Employee: {self.__name}, Salary: ${self.__salary}"
