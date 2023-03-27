import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BannerComponent } from './banner/banner.component';
import { HeadlinesComponent } from './headlines/headlines.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NavigationComponent } from './navigation/navigation.component';

const routes: Routes = [

];

@NgModule({
  imports: [  RouterModule.forRoot([
    {path: 'home', component: HomepageComponent,},
    {path: 'headlines', component: HeadlinesComponent},
    {path: 'nav', component: NavigationComponent},
    {path: 'banner', component: BannerComponent,},
    {path: '', redirectTo: '/home', pathMatch: 'full'},
  ]),],
  exports: [RouterModule]
})
export class AppRoutingModule { }
