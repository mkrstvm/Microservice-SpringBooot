import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngdirective',
  templateUrl: './ngdirective.component.html',
  styles:[`
   .textcolor { color : white;}
  `]
})
export class NgdirectiveComponent implements OnInit {

  hidedisplay = false;
  constructor() { }
  logs = [];

  ngOnInit() {
  }

  onbtnClick()
  {
    this.hidedisplay = this.hidedisplay ? false : true;
    this.logs.push("button clicked on time" + new Date().toLocaleDateString())
  }
}
