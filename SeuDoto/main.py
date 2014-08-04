#!/usr/bin/env python
#
# Copyright 2007 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
import webapp2
import os

try:
	from django.utils import simplejson
except:
	import json as simplejson
	
from google.appengine.api import users
from google.appengine.ext import db

class Profissional(db.Model):
	nome = db.StringProperty
	identificacao = db.StringProperty
	especialidade = db.StringProperty

class GetProfissional(webapp2.RequestHandler):
	def get(self):
		nome = self.request.get('nome')
		profissionais = Profissional.all()
		profissionais = profissionais.filter("nome =",nome)
		
		if profissionais.get():
			self.response.out.write(profissionais.get().data)
		else: self.response.out.write("Profissional nao encontrado")

class MainHandler(webapp2.RequestHandler):
    def get(self):
        self.response.write('Hello world!')

app = webapp2.WSGIApplication([
    ('/', MainHandler)
	('/get_profissional',GetProfissional)
], debug=True)
