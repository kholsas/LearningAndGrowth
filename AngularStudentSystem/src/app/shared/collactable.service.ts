import {Person} from './Person';

export class CollactableService {

  private registeredStudents: Person[] = [];

  getCollectables() {
    return this.registeredStudents;
  }

  addStudent(firstName: String, lastName: String, emailAddress: String, studentNumber: String, facultyName: String, degreeName: String) {
    const person: Person = new Person();
    person.firstName = firstName;
    person.lastName = lastName;
    person.emailAddress = emailAddress;
    person.studentNumber = studentNumber;
    person.facultyName = facultyName;
    person.degreeName = degreeName;

    this.registeredStudents.push(person);
  }

  removeStudent(student: Person) {
   const studentInCollection =  this.registeredStudents.find(person => person.studentNumber === student.studentNumber);
   this.registeredStudents.splice(this.registeredStudents.indexOf(studentInCollection), 1);
  }
}
