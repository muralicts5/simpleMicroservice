<form:form method="POST" action="/springMvc/addEmployee.html"
  modelAttribute="employee">


	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 " for="Id">Id</label>
               <div class="col-md-7">
                    <form:input type="text" path="employeeId"  class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="employeeId" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="username">Username</label>
               <div class="col-md-7">
                    <form:input type="text" path="name" id="username" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="name" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="dob">DOB</label>
               <div class="col-md-7">
                    <form:input type="date" path="dob" id="dob" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="dob" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
 
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="email">Email</label>
               <div class="col-md-7">
                    <form:input type="email" path="email" id="email" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="email" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
  
  <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="designation">Designation</label>
               <div class="col-md-7">
                   <form:select path="designation" id="designation">
                        <form:option value="">Select Role</form:option>
                        <form:options items="${designations}" />
    					</form:select>
                    <div class="has-error">
                        <form:errors path="designation" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div> 
   
    
      <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="salary">Salary</label>
               <div class="col-md-7">
                    <form:input type="text" path="salary" id="salary" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="salary" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div> 
    <input type="submit" value="Submit" />

</form:form>
