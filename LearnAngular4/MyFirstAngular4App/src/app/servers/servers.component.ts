import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  allowNewServer: Boolean = false;
  serverCreationStatus: String = 'No Server was created so far!';

  constructor() {
    setTimeout(() => {
      this.allowNewServer = true;
    }, 3000);
  }

  ngOnInit() {
  }

  onServerCreation() {
    this.serverCreationStatus = 'Server was Created!';
  }

  onUpdateServerName(event: any) {
console.log(event);
  }
}
