import {Component, Injectable, OnInit} from '@angular/core';
import {Person} from '../shared/Person';
import {CollactableService} from '../shared/collactable.service';

@Component({
  selector: 'app-student-listing',
  templateUrl: './student-listing.component.html',
  styleUrls: ['./student-listing.component.css']
})

@Injectable()
export class StudentListingComponent implements OnInit {

  registeredStudents: Person[] = [];

  constructor(private collectableService: CollactableService) {

  }

  ngOnInit() {
    this.registeredStudents = this.collectableService.getCollectables();
  }

  deleteStudent(student: Person) {
    this.collectableService.removeStudent(student);
  }
}
