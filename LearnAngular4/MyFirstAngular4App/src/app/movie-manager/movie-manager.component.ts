import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-manager',
  templateUrl: './movie-manager.component.html',
  styleUrls: ['./movie-manager.component.css']
})
export class MovieManagerComponent implements OnInit {

  name = 'hello';
  constructor() { }

  ngOnInit() {
  }

}
