import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';


import {AppComponent} from './app.component';
import {ServerComponent} from './server/server.component';
import { ServersComponent } from './servers/servers.component';
import { MovieManagerComponent } from './movie-manager/movie-manager.component';
import { SideBarMenuComponent } from './side-bar-menu/side-bar-menu.component';


@NgModule({
  declarations: [
    AppComponent,
    ServerComponent,
    ServersComponent,
    MovieManagerComponent,
    SideBarMenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
