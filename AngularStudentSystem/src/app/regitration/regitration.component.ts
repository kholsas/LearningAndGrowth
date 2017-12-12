import {Component, OnInit} from '@angular/core';
import {StudentListingComponent} from '../student-listing/student-listing.component';
import {Person} from '../Person';

@Component({
  selector: 'app-regitration',
  templateUrl: './regitration.component.html',
  styleUrls: ['./regitration.component.css']
})
export class RegitrationComponent implements OnInit {

  private _studentListingComponent = new StudentListingComponent();
  private student: Person = new Person();

  constructor() {
  }

  ngOnInit() {
  }


  public registerStudent() {
    this.student.studentNumber = this.getStudentNumber();
    this._studentListingComponent.registerStudent(this.student);
    /*this.student.firstName, this.student.lastName,
      this.student.emailAddress, this.student.studentNumber, this.student.facultyName, this.student.degreeName*/
  }

  private getStudentNumber() {
    return this.student.firstName.substr(0, 2).concat(
      this.student.lastName.substr(0, 3)).concat((Math.random() + '').substr(2, 4)).toUpperCase();
  }
}
