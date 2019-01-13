import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WrningalertComponent } from './wrningalert.component';

describe('WrningalertComponent', () => {
  let component: WrningalertComponent;
  let fixture: ComponentFixture<WrningalertComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WrningalertComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WrningalertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
