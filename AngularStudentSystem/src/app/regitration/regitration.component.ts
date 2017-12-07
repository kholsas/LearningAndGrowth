import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-regitration',
  templateUrl: './regitration.component.html',
  styleUrls: ['./regitration.component.css']
})
export class RegitrationComponent implements OnInit {

  firstName: String = '';
  lastName: String = '';
  emailAddress: String = '';
  studentNumber: String = '';
  facultyName: String = '';
  degreeName: String = '';


  constructor() {
  }

  ngOnInit() {
  }

  registerStudent() {
    this.studentNumber = this.getStudentNumber();
  }

  private getStudentNumber() {
    return this.firstName.substr(0, 2).concat(this.lastName.substr(0,3)).concat((Math.random() + '').substr(2,4 )).toUpperCase();
  }
}
