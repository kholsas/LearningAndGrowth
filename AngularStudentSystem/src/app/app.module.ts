import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {RegitrationComponent} from './regitration/regitration.component';
import {StudentListingComponent} from './student-listing/student-listing.component';
import {FormsModule} from '@angular/forms';
import {StudentService} from './StudentService';


@NgModule({
  declarations: [
    AppComponent,
    RegitrationComponent,
    StudentListingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [StudentService, StudentListingComponent],
  bootstrap: [AppComponent]
})
export class AppModule {
}
