<script>
export default{
name:'LoginForm'
}
</script>

<template>
<form id="login-form">
<h2> Lovely to see you </h2>
<div class="row">
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Username<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="loginUsername">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Password<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="loginPassword">
</div>
<div class="col-12 form-group text-center">
<button class="btn btn-vue btn-lg col-4 btn-outline-dark"> Submit </button>
</div>
<div class="col-12 form-group text-center">
<p>Is this your first time? Register now.</p>
</div>
</div>
</form>
</template>


<style>
.btn-vue
{
margin-top:15px;
border-radius: 20px;
margin-bottom: 15px;
}

</style>