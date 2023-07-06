import { Component } from '@angular/core';
import { User } from '../../model/user';
import { UserService } from '../../user.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-accessform',
  templateUrl: './accessform.component.html',
  styleUrls: ['./accessform.component.scss']
})
export class AccessformComponent {
  users!: User[];
  constructor(private userService: UserService, private router:Router){}
  ngOnInit():void{
    this.userService.getUsers().subscribe((data:User[])=>{
      console.log(data);
      this.users = data;
    })
  }
  verify(username:string,password:string):boolean{
    let user = this.users.find(user=>{
      return user.name === username;
    })
    if((user?.password) == password){
      console.log("accessform-verigy es correcto");
      this.router.navigate(['/species']);
      // return true;      
    }else{
      console.log("accessform-verigy no es correcto")
    }
    
    return false;
  }
}
