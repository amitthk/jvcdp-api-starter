import sys, os, json
from jinja2 import Environment, FileSystemLoader

PATH = os.path.dirname(os.path.abspath(__file__))
TEMPLATE_ENVIRONMENT = Environment(
    autoescape=False,
    loader=FileSystemLoader(os.path.join(PATH,'templates')),
    trim_blocks=False)

def render_template(template_name,context):
    return TEMPLATE_ENVIRONMENT.get_template(template_name).render(context)

def convert_templates():
    context = json.load(sys.stdin)
    print(json.dumps(context))
    for template_name in os.listdir(os.path.join(os.getcwd(),'templates')):
        if template_name.endswith('.j2'):
            print('Now Processing : [{}]'.format(template_name))
            fname = 'output/{}.yml'.format(template_name.rsplit('.',1)[0])
            with open(fname,'w') as f:
                f_output = render_template(template_name,context)
                f.write(f_output)
        else:
            continue

def main():
    convert_templates()

if __name__=="__main__":
    main()

