import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';
import { ServersComponent } from './servers/servers.component';
import { WrningalertComponent } from './wrningalert/wrningalert.component';
import { SuccessalertComponent } from './successalert/successalert.component';
import { UserComponent } from './user/user.component';
import { NgdirectiveComponent } from './ngdirective/ngdirective.component';

@NgModule({
  declarations: [
    AppComponent,
    ServerComponent,
    ServersComponent,
    WrningalertComponent,
    SuccessalertComponent,
    UserComponent,
    NgdirectiveComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
