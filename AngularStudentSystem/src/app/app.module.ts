import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {RegistrationComponent} from './regitration/regitration.component';
import {StudentListingComponent} from './student-listing/student-listing.component';
import {FormsModule} from '@angular/forms';
import {CollactableService} from './shared/collactable.service';


@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    StudentListingComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [CollactableService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
