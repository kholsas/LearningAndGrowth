import {Component, Injectable, OnInit} from '@angular/core';
import {Person} from '../Person';
import {StudentService} from '../StudentService';

@Component({
  selector: 'app-student-listing',
  templateUrl: './student-listing.component.html',
  styleUrls: ['./student-listing.component.css']
})

@Injectable()
export class StudentListingComponent implements OnInit {


  constructor(private studentService: StudentService) {
  }

  ngOnInit() {
  }

  public registerStudent(student: Person) {

    this.studentService.registeredStudents.push(student);

    console.log(this.studentService.registeredStudents[0]);
  }
}
