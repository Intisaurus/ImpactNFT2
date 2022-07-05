<script>
export default{
name:'CompleteProgramForm'
}
</script>

<template>
<form id="completeprogram-form">
<h2> Please update your program progress </h2>
<div class="row">
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >What year was Impact founded?<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="answer1">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >How many branches does Impact have?<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="answer2">
</div>
<div class="col-12 form group">
<label class="col-form-label col-form-label-lg" text-left >How many countries is Impact in?<span class="text-danger"></span></label>
<input type = "text" class="form-control form-control-lg" id="answer3">
</div>
</div>
<div class="col-12 form-group text-center">
<button class="btn btn-vue btn-lg col-4 btn-outline-dark mt-5"> Complete </button>
</div>
</form>
</template>