import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {RegistrationComponent} from './regitration/regitration.component';
import {StudentListingComponent} from './student-listing/student-listing.component';
import {FormsModule} from '@angular/forms';
import {CollactableService} from './shared/collactable.service';
import { HeaderComponent } from './header.component';
import {routing} from './app.routing';


@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    StudentListingComponent,
    HeaderComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    routing
  ],
  providers: [CollactableService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
