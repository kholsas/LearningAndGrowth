import {Component, OnInit} from '@angular/core';
import {Person} from '../Person';
import {StudentService} from '../StudentService';
import {StudentListingComponent} from '../student-listing/student-listing.component';

@Component({
  selector: 'app-regitration',
  templateUrl: './regitration.component.html',
  styleUrls: ['./regitration.component.css']
})
export class RegitrationComponent implements OnInit {


  private student: Person = new Person();

  constructor(private studentService: StudentService,
              private studentListingComp: StudentListingComponent) {
  }


  ngOnInit() {
  }


  public registerStudent() {
    this.student.studentNumber = this.getStudentNumber();
    this.studentListingComp.registerStudent(this.student);
  }

  private getStudentNumber() {
    return this.student.firstName.substr(0, 2).concat(
      this.student.lastName.substr(0, 3)).concat((Math.random() + '').substr(2, 4)).toUpperCase();
  }
}
