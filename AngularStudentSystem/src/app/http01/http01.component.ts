import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Post} from '../shared/Post';

@Component({
  selector: 'app-http01',
  templateUrl: './http01.component.html',
  styleUrls: ['./http01.component.css']
})
export class Http01Component implements OnInit {
  arrayOfPosts: Post[] = [];

  constructor(private httpCli: HttpClient) {
  }

  ngOnInit() {

    this.httpCli.get('https://jsonplaceholder.typicode.com/posts').subscribe(data => {
      this.arrayOfPosts = <Post[]> data;

    });
  }

}
