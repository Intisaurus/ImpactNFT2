<template>
<form id="signup-form">
<h2> Welcome to Elev8 </h2>
<div class="row">
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Name<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="name">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Surname<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="surname">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Email<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="email">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left > Wallet Address<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="walletAddress">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Password<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="password">
</div>
<div class="col-12 form group">
 <label class="col-form-label col-form-label-lg" text-left > Confirm Password<span class="text-danger"></span></label>
 <input type = "text" class="form-control form-control-lg" id="confirmPassword">
 </div>
<div class="col-12 form-group text-center">
<button class="btn btn-vue btn-lg col-4 btn-outline-dark"> Submit </button>
</div>
</div>
</form>
</template>

<script>
export default{
name:'LoginForm'
}
</script>

<style scoped>
.btn-vue
{
margin-top:15px;
border-radius: 20px;
margin-bottom: 15px;
}

</style>