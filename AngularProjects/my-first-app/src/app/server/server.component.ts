import { Component } from "@angular/core";

@Component({
    selector:"app-server",
    templateUrl:'./server.component.html',
    styles: [`
    .online {color : white;}
    `]
})

export class ServerComponent{
    serverid:number = 10;
    serverstatus:string = 'offline';

    constructor(){
        this.serverstatus = Math.random() > 0.5 ? 'Online' : 'Offline';
    }

    getServerstatus(){
        return this.serverstatus;
    }

    getColor(){
        return this.serverstatus === 'Online' ? 'green' : 'red';
    }
}