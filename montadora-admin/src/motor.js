import * as React from "react";
import { List, Datagrid, TextField, EditButton, Edit, SimpleForm, TextInput, NumberInput, Create} from 'react-admin';

export const MotorList = props => (
    <List {...props}>
        <Datagrid>
            <TextField source="id" />
            <TextField source="fabricacao" />
            <TextField source="cilindrada" />
            <EditButton />
        </Datagrid>
    </List>
);

export const MotorEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disabled source="id" />
            <TextInput source="cilindrada" />
            <NumberInput source="fabricacao" />
        </SimpleForm>
    </Edit>
);

export const MotorCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="cilindrada" />
            <NumberInput source="fabricacao" />
        </SimpleForm>
    </Create>
);