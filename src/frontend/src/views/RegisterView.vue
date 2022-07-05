<template>
  <div class="container">
    <router-view/>
     <div class="col-md-8 offset-md-2 rounded px-5 py-4 shadow bg-white text-center mt-5 mb-5 ">
          <SignUpForm />
     </div>
  </div>
</template>

<script>
import SignUpForm from '@/components/SignUpForm.vue'
  export default {
  name:'RegisterView',
  components: {
  SignUpForm
  },
    data() {
      return {}
    }
  }
</script>