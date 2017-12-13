import {RouterModule, Routes} from '@angular/router';
import {RegistrationComponent} from './regitration/regitration.component';
import {StudentListingComponent} from './student-listing/student-listing.component';

const APP_ROUTES: Routes = [
  {path: '', redirectTo: '/list', pathMatch: 'full'},
  {path: 'register', component: RegistrationComponent},
  {path: 'list', component: StudentListingComponent},
];


export const routing = RouterModule.forRoot(APP_ROUTES);
