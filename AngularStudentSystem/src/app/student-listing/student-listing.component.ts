import {Component, OnInit} from '@angular/core';
import {Person} from '../Person';

@Component({
  selector: 'app-student-listing',
  templateUrl: './student-listing.component.html',
  styleUrls: ['./student-listing.component.css']
})
export class StudentListingComponent implements OnInit {


  registeredStudents: Array<Person> = [];

  constructor() {
  }

  ngOnInit() {
  }

  public registerStudent(student: Person) {

    this.registeredStudents.push(student);

    console.log(this.registeredStudents[0]);
  }
}
