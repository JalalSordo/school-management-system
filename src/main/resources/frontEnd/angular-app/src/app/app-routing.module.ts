import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonListComponent } from './person-list/person-list.component';
import { PersonFormComponent } from './person-form/person-form.component';
import { PersonTestComponent } from './person-test/person-test.component';
const routes: Routes = [{ path: 'persons/:id', component: PersonTestComponent },
{ path: 'persons', component: PersonListComponent },
{ path: 'addperson', component: PersonFormComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
