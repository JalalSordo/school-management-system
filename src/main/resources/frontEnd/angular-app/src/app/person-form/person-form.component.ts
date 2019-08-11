import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonService } from '../service/person-service.service';
import { Person } from '../model/person';
 
@Component({
  selector: 'app-person-form',
  templateUrl: './person-form.component.html',
  styleUrls: ['./person-form.component.css']
})
export class PersonFormComponent {
 
  person: Person;
 
  constructor(private route: ActivatedRoute, private router: Router, private personService: PersonService) {
    this.person = new Person();
  }
 
  onSubmit() {
    this.personService.save(this.person).subscribe(result => this.gotoPersonList());
  }
 
  gotoPersonList() {
    this.router.navigate(['/persons']);
  }
}