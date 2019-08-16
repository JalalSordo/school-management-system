import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonService } from '../service/person-service.service';
import { Person } from '../model/person';
import { Location } from '@angular/common';

@Component({
  selector: 'app-person-test',
  templateUrl: './person-test.component.html',
  styleUrls: ['./person-test.component.css']
})
export class PersonTestComponent implements OnInit  {
@Input() person: Person;

  constructor(private route: ActivatedRoute, private router: Router, private personService: PersonService,private location: Location) {
    
  }

  ngOnInit(): void {
    this.getPerson();
  }

	getPerson(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.personService.getPerson(id)
      .subscribe(person => this.person = person);
      console.log('ok');
  }
  
  Onsave(): void {
    this.personService.update(this.person)
      .subscribe(() => this.goBack());
  }
  
  goBack(): void {
    this.location.back();
  }
   delete(person: Person): void {
    
    this.personService.deletePerson(person).subscribe(result => this.gotoPersonList());
  }
  gotoPersonList() {
    this.router.navigate(['/persons']);
  }
  save(): void {
    this.personService.updatePerson(this.person)
      .subscribe();
  }
}
