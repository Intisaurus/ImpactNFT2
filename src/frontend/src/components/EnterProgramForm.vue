<script>
export default{
name:'EnterProgramForm'
}
</script>

<template>
<form id="enterprogram-form">
<h2> Please complete the program details</h2>
<div class="row">
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Name<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="programName">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Description<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="programDesc">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Department<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="programDep">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >Duration<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="programDur">
</div>
</div>
<div class="col-12 form-group text-center">
<button class="btn btn-vue btn-lg col-4 btn-outline-dark mt-5"> Create </button>
</div>
</form>
</template>