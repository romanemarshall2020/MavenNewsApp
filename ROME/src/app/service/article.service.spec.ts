import { ArticleService } from "./article.service";
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

describe("articleService", () => {
  let component: ArticleService ;
  let fixture: ComponentFixture<ArticleService>;
  let httpClient: HttpClient;
  let httpTestingController: HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports:[HttpClientTestingModule],
      declarations: [ ArticleService ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArticleService);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it("should contain list of articles from backend", () => {
    let http = new HttpClient()
    let topic = "apple"
    const articleService = new ArticleService(http)
    expect()
  })
})
