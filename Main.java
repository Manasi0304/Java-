class Employee {
    int id;
    String name;
    Employee next;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
}

class EmployeeLinkedList {
    Employee head;

    public void insert(int id, String name) {
        Employee newEmployee = new Employee(id, name);

        if (head == null) {
            head = newEmployee;
            return;

        }

        Employee current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newEmployee;
    }

    public void delete(int id) {
        Employee current = head;
        Employee previous = null;

        while (current != null &amp;&amp; current.id != id) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public Employee search(int id) {

        Employee current = head;

        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public void modify(int id, String newName) {
        Employee current = head;

        while (current != null) {
            if (current.id == id) {
                current.name = newName;
                return;
            }
            current = current.next;
        }
    }

    public void display() {
        Employee current = head;

        while (current != null) {
            System.out.println(&quot;Employee ID: &quot; + current.id + &quot;, Employee Name: &quot; + current.name);
            current = current.next;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeLinkedList employeeList = new EmployeeLinkedList();

        employeeList.insert(1, &quot;Kiran&quot;);
        employeeList.insert(2, &quot;Sanika&quot;);
        employeeList.insert(3, &quot;Rakhi&quot;);

        System.out.println(&quot;Original Employee List:&quot;);
        employeeList.display();

        // Delete an employee
        employeeList.delete(2);
        System.out.println(&quot;\nEmployee List after Deletion:&quot;);
        employeeList.display();

        // Search for an employee
        Employee employee = employeeList.search(1);
        System.out.println(&quot;\nSearched Employee: &quot; + employee.id + &quot;, &quot; + employee.name);

        // Modify an employee
        employeeList.modify(1, &quot;Kiran&quot;);
        System.out.println(&quot;\nEmployee List after Modification:&quot;);
        employeeList.display();
    }
}

