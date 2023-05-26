import { ComponentFixture, TestBed } from '@angular/core/testing';

import {TechHeadlinesComponent } from './techHeadlines.component';

describe('HeadlinesComponent', () => {
  let component: TechHeadlinesComponent;
  let fixture: ComponentFixture<TechHeadlinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TechHeadlinesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TechHeadlinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
