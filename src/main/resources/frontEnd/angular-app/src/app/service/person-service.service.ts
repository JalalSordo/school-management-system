import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Person } from '../model/person';
import { Observable } from 'rxjs/Observable';
 
@Injectable()
export class PersonService {
 
  private personsUrl: string;
 
  constructor(private http: HttpClient) {
    this.personsUrl = 'http://localhost:8080/persons';
  }
 
  public findAll(): Observable<Person[]> {
    return this.http.get<Person[]>(this.personsUrl);
  }
 
  public save(person: Person) {
    return this.http.post<Person>(this.personsUrl, person);
  }
  
  public update(person : Person): Observable<any>{
  	return this.http.put(this.personsUrl, person);
  }
  
  getPerson(id: number): Observable<Person> {
    const url = `${this.personsUrl}/${id}`;
    return this.http.get<Person>(url);
  }
  deletePerson (person: Person | number): Observable<Person> {
    const id = typeof person === 'number' ? person : person.id;
    const url = `${this.personsUrl}/${id}`;

    return this.http.delete<Person>(url);
    
  }
  updatePerson (person: Person): Observable<any> {
    return this.http.put(this.personsUrl, person);
  }
 
}