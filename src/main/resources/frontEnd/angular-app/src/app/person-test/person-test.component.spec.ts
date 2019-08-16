import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonTestComponent } from './person-test.component';

describe('PersonTestComponent', () => {
  let component: PersonTestComponent;
  let fixture: ComponentFixture<PersonTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PersonTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PersonTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
