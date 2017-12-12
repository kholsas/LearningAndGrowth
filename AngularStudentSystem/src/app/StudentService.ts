import {Injectable} from '@angular/core';
import {Person} from './Person';

@Injectable()
export class StudentService {
   registeredStudents: Array<Person> = [];

}
