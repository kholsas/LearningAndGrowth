import {Component, OnInit} from '@angular/core';
import {Person} from '../shared/Person';
import {CollactableService} from '../shared/collactable.service';

@Component({
  selector: 'app-regitration',
  templateUrl: './regitration.component.html',
  styleUrls: ['./regitration.component.css']
})
export class RegistrationComponent implements OnInit {


  student: Person = new Person();
  collectables = [];

  constructor(private collectableService: CollactableService) {
  }


  ngOnInit() {
    this.collectables = this.collectableService.getCollectables();
  }


  public registerStudent() {

    this.student.studentNumber = this.getStudentNumber();
    this.collectableService.addStudent(this.student.firstName, this.student.lastName,
      this.student.emailAddress, this.student.studentNumber, this.student.facultyName, this.student.degreeName);
  }

  private getStudentNumber() {
    return this.student.firstName.substr(0, 2).concat(
      this.student.lastName.substr(0, 3)).concat((Math.random() + '').substr(2, 4)).toUpperCase();
  }
}
