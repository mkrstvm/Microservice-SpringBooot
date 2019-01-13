import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {

  serverName = ''
  addNewServer = false;
  serverCreationStatuc = "No server created";
  serverAdded =  false;
  servers = ['TestServr1','TestServer2'];

  constructor() { 
    setTimeout(() => {
      this.addNewServer = true;
    }, 5000);
  }

  ngOnInit() {
  }

  OnServerCreated()
  {
    this.serverCreationStatuc = "server was created with Name" + this.serverName; 
    this.serverAdded = true;
    this.servers.push(this.serverName);
  }

  OnUpdateServerName(event : Event)
  {
    this.serverName = (<HTMLInputElement>event.target).value;
  }
}
